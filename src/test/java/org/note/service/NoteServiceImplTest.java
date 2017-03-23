
package org.note.service;

import java.io.IOException;
import java.util.ArrayList;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.note.application.NoteApplication;
import org.note.exception.ServiceException;
import org.note.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 
 * @author sudheerp This class is used to test the notes
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes={NoteApplication.class})
public class NoteServiceImplTest {
	@Autowired
	NoteService service;
	
	@Test
	public void testAddNote(){
		Note note=new Note();
		note.setName("TestNote");
		note.setMessage("TestMessage");
		ArrayList<Note> notes;
		try {
			notes = service.addNote(note);
			Assert.assertNotNull(notes);
			Assert.assertNotNull(notes.get(0));
			Assert.assertEquals("TestNote",notes.get(0).getName());
		} catch (ServiceException | IOException e) {
			Assert.fail(e.getMessage());
		} 
		
	}
	@Test
	public void testGetNote() {
		try {
			Note note = service.getNoteByName("TestNote");
			Assert.assertNotNull(note);
		//	Assert.assertNotNull();
		} catch (ServiceException e) {
			Assert.fail(e.getMessage());
		} catch (IOException e) {
			Assert.fail(e.getMessage());
		}
	}
}
	
