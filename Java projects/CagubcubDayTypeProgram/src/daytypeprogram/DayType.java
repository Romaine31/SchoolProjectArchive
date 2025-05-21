/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daytypeprogram;

/**
 *
 * @author John Romaine Cagubcub
 */
public class DayType {
    private String day;
    private String days[] = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    public DayType (){
        this.day = "Sun";
    }
    
    
    public void setDay(String sday){
        this.day = sday;
    }
    
    public DayType(String sday){
        setDay(sday);
    }
    
    public String getDay(){
        return this.day;
    }
    
    public String nextDay (String cDay){
        int DayIndex = DayCompare(cDay);
        DayIndex++;
        if (DayIndex > 6)
            DayIndex = 0;
        return days[DayIndex];
    }
    
    public String prevDay (String cDay){
        int DayIndex = DayCompare(cDay);
        DayIndex--;
        if (DayIndex < 0)
            DayIndex = 6;
        return days[DayIndex];
    }
    
        public String addDays (String cDay,int aDay){
        int DayIndex = DayCompare(cDay);
        for (int x = 0; x != aDay; x++){
            if (DayIndex > 7)
                DayIndex = 1;
            else
                DayIndex++;
        }
        return days[DayIndex];
    }
    
            public String subDays (String cDay,int aDay){
        int DayIndex = DayCompare(cDay);
        for (int x = 0; x != aDay; x++){
            if (DayIndex < 1)
                DayIndex = 7;
            else
                DayIndex--;
        }
        return days[DayIndex];
    }
    
    public int DayCompare(String cDay){
        int x=0;
        switch (cDay) {
            case "Sun":
                x = 0;
                break;
            case "Mon":
                x = 1;
                break;
            case "Tue":
                x = 2;
                break;
            case "Wed":
                x = 3;
                break;
            case "Thu":
                x = 4;
                break;
            case "Fri":
                x = 5;
                break;
            case "Sat":
                x = 6;
                break;
        }
        return x;
    }
    /**
    public String nextDay(String cDay){
        int DayIndex = DayCompare(cDay)+1;
        return days[DayIndex];
    }
    public String prevDay (String cDay){
        int DayIndex = DayCompare(cDay)-1;
        return days[DayIndex];
    }
broken methods, not deleting because good memories.
**/
}
