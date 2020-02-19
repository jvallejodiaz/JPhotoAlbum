package fi.iki.jka;

import org.junit.Test;

import java.awt.event.ActionEvent;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class JPhotoFrameTest {
    @Test
    public void checkThatAnActionCanBeCreated() throws Exception {
        JPhotoFrame frame = new JPhotoFrame();

        assertNotNull(frame);
    }

    @Test
    public void testActionPerformed() throws Exception {
        JPhotoCollection photos = new JPhotoCollection();
        JPhotoFrame frame = new JPhotoFrame("Name", photos);
        ActionEvent event = new ActionEvent(new Object(), 1, "Start Slideshow");
        frame.actionPerformed(event);
    }
}