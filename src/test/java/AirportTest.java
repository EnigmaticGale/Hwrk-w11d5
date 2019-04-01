import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Plane plane1;
    Plane plane2;
    Airport airport1;

    @Before
    public void before () {
        plane1 = new Plane(PlaneType.BOEING_737,AirlineType.EASYJET);
        plane2 = new Plane(PlaneType.BIPLANE,AirlineType.RYANAIR);
        airport1 = new Airport(AirportCode.LON);
    }

    @Test
    public void canGetProperties () {
        assertEquals(AirportCode.LON, airport1.getAirportCode());
    }

    @Test
    public void hangerArrayStartsEmpty () {
        assertEquals(0, airport1.getHanger().size());
    }

    @Test
    public void canAddPlanToHanger () {
        airport1.addPlaneToHanger(plane1);
        assertEquals(1,airport1.getHanger().size());
    }

    @Test
    public void canCreateFlight () {
        airport1.addPlaneToHanger(plane1);
        assertEquals(001,airport1.createFlight(001,Destination.LONDON).getFlightNo());
        assertEquals(0,airport1.getHanger().size());
    }

    @Test
    public void canGetSoldTecketTicket () {
        airport1.addPlaneToHanger(plane1);
        Flight testFlight = airport1.createFlight(001,Destination.LONDON);
        airport1.sellTicket(testFlight);
        assertEquals(1,airport1.sellTicket(testFlight).get("Flight Number:"));
    }
}
