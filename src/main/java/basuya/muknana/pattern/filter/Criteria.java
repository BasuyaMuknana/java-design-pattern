package basuya.muknana.pattern.filter;

import basuya.muknana.origin.person.Person;

import java.util.List;

/**
 * Created by 2904 on 2015/4/14.
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
