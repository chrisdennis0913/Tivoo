import java.util.GregorianCalendar;


public class Event
{
    private String mySubject;
    private GregorianCalendar myStart;
    private GregorianCalendar myEnd;
    // deal with all day events
    private String myDescription;
    private String myLocation;
    private String myPriority; // level like low
    private String myPrivacy; // yes or no
    private String myReminderOnOff; // on or off
    private GregorianCalendar myReminder;
    private String mySensitivity; // a level like normal
    private String myShowTimeAs; // no clue, but normally 2


    public Event (String subject,
                  int startYear,
                  int startMonth,
                  int startDay,
                  int startHour,
                  int startMinute,
                  int endYear,
                  int endMonth,
                  int endDay,
                  int endHour,
                  int endMinute,
                  String description,
                  String location,
                  String priority,
                  String privacy,
                  String reminderOnOff,
                  int reminderYear,
                  int reminderMonth,
                  int reminderDay,
                  int reminderHour,
                  int reminderMinute,
                  String sensitivity,
                  String showTimeAs)
    {
        mySubject = subject;
        myStart.set(startYear, startMonth, startDay, startHour, startMinute);
        myEnd.set(endYear, endMonth, endDay, endHour, endMinute);

        myReminder = null;
        if (reminderOnOff.equals("On")) myReminder.set(reminderYear,
                                                       reminderMonth,
                                                       reminderDay,
                                                       reminderHour,
                                                       reminderMinute);
        myDescription = description;
        myLocation = location;
        myPriority = priority;
        myPrivacy = privacy;
        mySensitivity = sensitivity;
        myShowTimeAs = showTimeAs;
    }

    public String getSubject ()
    {
        return mySubject;
    }
    public GregorianCalendar getStartDate ()
    {
        return myStart;
    }
    public GregorianCalendar getEndDate ()
    {
        return myEnd;
    }
    public boolean isThereAReminder ()
    {
        return myReminderOnOff.equalsIgnoreCase("on");
    }
    public GregorianCalendar getReminderDate ()
    {
        return myReminder;
    }
    public String getLocation(){
        return myLocation;
    }
    public String getPrivacy ()
    {
        return myPrivacy;
    }
    public String getPriority()
    {
        return myPriority;
    }
    public String getSensitivity ()
    {
        return mySensitivity;
    }
    public String getShowTimeAs ()
    {
        return myShowTimeAs;
    }
}
