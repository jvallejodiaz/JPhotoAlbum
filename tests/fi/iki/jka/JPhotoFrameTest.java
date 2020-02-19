package fi.iki.jka;

import org.junit.Test;

import java.awt.event.ActionEvent;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class JPhotoFrameTest {
    @Test
    public void checkThatAnActionCanBeCreated() throws Exception {
        JPhotoFrame frame = new JPhotoFrame(){
            @Override
            public void setTitle() {
            }

            @Override
            void showSlideshow(int interval) {
            }
        };

        assertNotNull(frame);
    }

    @Test
    public void testActionPerformed() throws Exception {
        JPhotoFrame frame = new JPhotoFrame(){
            @Override
            public void setTitle() {
            }

            @Override
            void showSlideshow(int interval) {
            }
        };
        ActionEvent event = new ActionEvent(new Object(), 1, "Start Slideshow");
        frame.actionPerformed(event);
    }

    @Test
    public void commandReturnsFalse() throws Exception {
        JPhotoFrame frame = new JPhotoFrame(){
            @Override
            public void setTitle() {
            }

            @Override
            void showSlideshow(int interval) {
            }
        };
        ActionEvent event = new ActionEvent(new Object(), 1, "Start Slideshow");
        assertThat(frame.executeCommand(event), equalTo(false));
    }

    @Test
    public void testPhotos() throws Exception {
        JPhotoFrame frame = new JPhotoFrame(){
            @Override
            public void setTitle() {
            }

            @Override
            void showSlideshow(int interval) {
            }
        };

        ActionEvent event = new ActionEvent(new Object(), 1, "Start Slideshow");
        assertThat(frame.executeCommand(event), equalTo(false));
        assertThat(frame.interval, equalTo(5000));
    }

    @Test
    public void testNewFeature() throws Exception {
        JPhotoFrame frame = new JPhotoFrame(){
            @Override
            public void setTitle() {
            }

            @Override
            void showSlideshow(int interval) {
            }
        };

        ActionEvent event = new ActionEvent(new Object(), 1, "Faster Slideshow");
        assertThat(frame.executeCommand(event), equalTo(false));
        assertThat(frame.interval, equalTo(1000));
    }

}