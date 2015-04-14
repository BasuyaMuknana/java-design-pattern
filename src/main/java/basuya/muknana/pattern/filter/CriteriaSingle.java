package basuya.muknana.pattern.filter;

import basuya.muknana.origin.person.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 2904 on 2015/4/14.
 */
public class CriteriaSingle implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();

        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
