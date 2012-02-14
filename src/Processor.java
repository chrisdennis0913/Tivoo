import java.util.ArrayList;
import java.util.GregorianCalendar;


public class Processor {
	public ArrayList<Event> timeFrameFinder (ArrayList<Event> myEvents, GregorianCalendar start, GregorianCalendar end){
		ArrayList<Event> timeList = new ArrayList<Event> ();
		
		for (Event e: myEvents){
			if ( (e.getStartDate().getTimeInMillis() >= start.getTimeInMillis()) && 
					(e.getStartDate().getTimeInMillis() <= end.getTimeInMillis()) )
				timeList.add(e);
		}
		return timeList;
	}
	
	public ArrayList<Event> keywordFinder (ArrayList<Event> myEvents, String keyword){
		ArrayList<Event> keyList = new ArrayList<Event> ();
		
		for (Event e: myEvents){
			if (e.getSubject().startsWith(keyword)){
				keyList.add(e);
			}
		}
		return keyList; 
	}
	
}