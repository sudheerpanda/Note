
package org.note.service;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.note.application.NoteApplication;
import org.note.exception.ServiceException;
import org.note.model.Note;
import org.note.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 
 * @author sudheerp This class is used to test the samples
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes={NoteApplication.class})
public class NoteServiceImplTest {
	@Autowired
	NoteService service;
	@Test
	public void testGetProductSample() {
		/*try {
			Note note = service.getNoteByName("computer");
			Assert.assertNotNull(note);
			Assert.assertEquals("computer", note.getName());
		} catch (ServiceException e) {
			Assert.fail(e.getMessage());
		} catch (IOException e) {
			Assert.fail(e.getMessage());
		}*/
	}
}
	
