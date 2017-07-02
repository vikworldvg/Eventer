# Eventer!
Eventer app для отслеживания мероприятий. Json parse.

> ## Links
> * [vk.com](https://vk.com/h3xb0y/)
> * [demo](https://github.com/h3xboy/Eventer/blob/master/demo/app-debug.apk)
> * [database example](https://github.com/h3xboy/Eventer/blob/master/json/events_new.json)


![Screenshot](https://github.com/h3xboy/Eventer/blob/master/image/1497866662704.gif "WelcomeActivity")
![Screenshot](https://github.com/h3xboy/Eventer/blob/master/image/1497866139404.gif "WelcomeActivity")
![Screenshot](https://github.com/h3xboy/Eventer/blob/master/image/1497866227144.gif "WelcomeActivity")

## Алгоритм
![Screenshot](https://github.com/h3xboy/Eventer/blob/master/image/how.png "how")
##### Парсинг мероприятий выглядит следующим образом:
### .json файл
```
       "0":[
        {
            "EventName":"ПРОСНИСЬ И ПОЙ!",
            "Date":"24.06.2017",
	           "Time":"18:00",
            "Description":"Постановка ПРОСНИСЬ и ПОЙ",
            "Price":"50грн"
            
        },
        {
            "EventName":"ПИГМАЛИОН",
            "Date":"25.06.2017",
	           "Time":"18:00",
            "Description":"Постановка ПИГМАЛИОН",
            "Price":"50грн"
        }
        ],
```
### Java
```
 try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yy");
                String s1 = dateFormat.format(new Date());

                JSONObject object=new JSONObject(s);
                JSONArray arrays=object.getJSONArray(String.valueOf(num));

                for(int i=0;i<arrays.length();i++)
                {
                    JSONObject object1=arrays.getJSONObject(i);
                    String s2 = object1.getString("Date");
                    try {
                    date1 = dateFormat.parse(s1);
                    date2 = dateFormat.parse(s2);
                    } catch (ParseException e) {
                    e.printStackTrace();
                }
                    if (date2.getTime()>=date1.getTime())
                    {
                    contact=new Itemlist();
                    contact.setName(object1.getString("EventName"));
                    contact.setDate(object1.getString("Date"));
                    contact.setDescr(object1.getString("Description"));
                    contact.setTime(object1.getString("Time"));
                    contact.setPrice(object1.getString("Price"));
                    itemlist.add(contact);
                    }
}
```
#### Tags
json, db sqlite, map, recycler

### libs
##### build.gradle
```
    compile 'pl.droidsonroids.gif:android-gif-drawable:1.1.+'
    compile 'com.android.support:appcompat-v7:25.3.1'
    compile 'com.android.support:design:25.3.1'
    compile 'com.android.support:recyclerview-v7:25.3.1'
    compile 'com.android.support:cardview-v7:25.3.1'
    compile 'de.hdodenhof:circleimageview:1.3.0'
    compile 'com.rengwuxian.materialedittext:library:2.1.4'
    compile 'com.pixplicity.letterpress:library:1.0'
    compile 'com.google.android.gms:play-services:10.2.6'
    compile 'com.parse:parse-android:1.10.3'
    compile 'com.mcxiaoke.popupmenu:library:1.0.3'
    compile 'com.squareup.retrofit2:retrofit:2.2.0'
    compile 'com.squareup.retrofit2:converter-gson:2.0.0-beta4'
    compile 'com.android.support.constraint:constraint-layout:1.0.2'
    compile 'com.readystatesoftware.sqliteasset:sqliteassethelper:+'
    compile 'com.github.ivbaranov:materialfavoritebutton:0.1.4'
    compile 'com.android.support:support-v4:25.3.1'
    compile 'com.android.support:support-vector-drawable:25.3.1'
    compile 'com.github.bumptech.glide:glide:3.7.0'
```
### и да, я быдлокодер
