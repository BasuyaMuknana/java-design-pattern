package basuya.muknana.pattern.filter;

import basuya.muknana.origin.person.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 2904 on 2015/4/14.
 */
public class CriteriaMale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();

        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
