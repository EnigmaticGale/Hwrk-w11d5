import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PlaneTest {

    Plane plane1;
    Plane plane2;

    @Before
    public void before () {
        plane1 = new Plane(PlaneType.BOEING_737,AirlineType.EASYJET);
        plane2 = new Plane(PlaneType.BIPLANE,AirlineType.RYANAIR);
    }

    @Test
    public void canGetProperties () {
        assertEquals(PlaneType.BOEING_737, plane1.getPlaneType());
        assertEquals(AirlineType.EASYJET, plane1.getAirline());
        assertEquals(300, plane1.getCapacity());
    }

    @Test
    public void passengersArrayStartsEmpty () {
        assertEquals(0, plane1.getPassengers().size());
    }
}
