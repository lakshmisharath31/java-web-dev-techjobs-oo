package org.launchcode.techjobs_oo;
//        Line declares the variable nextId. Since it is static, its changing value is NOT stored within any Employer object.
import java.util.Objects;

public class Employer extends JobField {
    /*The first constructor accepts no arguments and assigns the value of nextId to the id field. It then increments nextId.
    Thus, every new Employer object will get a different ID number.*/

    public Employer() {

        super();

    }
    /*The second constructor assigns aValue to the value field.
    However, it ALSO initializes id for the object by calling the first constructor with the this(); statement.
    Including this(); in any Employer constructor makes initializing id a default behavio*
    */
   public Employer(String Value) {
       super(Value);
   }
    // Two objects are equal if they have the same id.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
