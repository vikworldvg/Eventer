package xebia.ismail.e_learning.recycler;


public class Itemlist {

    public String name,symbol;
    public String price,descr,time,date;

    public String getSymbol() {
        return symbol;
    }
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }



    public Itemlist()
    {
        this.name = name;
        this.date = date;
        this.descr = descr;
        this.time = time;
        this.price = price;

    }

    public Itemlist(String name, String date, String descr, String time,String price)
    {
        this.name = name;
        this.date = date;
        this.descr = descr;
        this.time = time;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getDate()
    {
        return date;
    }
    public void setDate(String date)
    {
        this.date = date;
    }

    public String getDescr()
    {
        return descr;
    }
    public void setDescr(String descr)
    {
        this.descr = descr;
    }

    public String getTime()
    {
        return time;
    }
    public void setTime(String time)
    {
        this.time = time;
    }

    public String getPrice()
    {
        return price;
    }
    public void setPrice(String price)
    {
        this.price = price;
    }
}
