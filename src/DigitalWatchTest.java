import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitalWatchTest {

    DigitalWatch watch = new DigitalWatch(12,21,59,2022,1,1);

    @Test
    void setTimeTest(){
        assertEquals("12:21:59",watch.getTime());
       assertEquals( "Invalid parameter",watch.setTime(-1,0,0));
    }

    @Test
    void setDateTest() {
        assertEquals("1/1/2022",watch.getDate());
        assertEquals("Invalid parameter",watch.setDate(2000,81,0));
    }

}