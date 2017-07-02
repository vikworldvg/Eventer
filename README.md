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
>       "0":[
>        {
>            "EventName":"ПРОСНИСЬ И ПОЙ!",
>            "Date":"24.06.2017",
>	           "Time":"18:00",
>            "Description":"Постановка ПРОСНИСЬ и ПОЙ",
>            "Price":"50грн"
>            
>        },
>        {
>            "EventName":"ПИГМАЛИОН",
>            "Date":"25.06.2017",
>	           "Time":"18:00",
>            "Description":"Постановка ПИГМАЛИОН",
>            "Price":"50грн"
>        }
>        ],
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

### и да, я быдлокодер
