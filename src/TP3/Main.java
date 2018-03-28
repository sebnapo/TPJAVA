package TP3;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {

	public static void main(String[] args) throws   MidiUnavailableException, InvalidMidiDataException, IOException {
		// TODO Auto-generated method stub
		ArrayList<User> listeUtilisateur = new ArrayList<>();
		Sequence sequence = MidiSystem.getSequence(new File("C:\\Users\\Sebastien\\Downloads\\californication.mid"));

	    // Create a sequencer for the sequence
	    Sequencer sequencer = MidiSystem.getSequencer();
	    sequencer.open();
	    sequencer.setSequence(sequence);

	    // Start playing
	    sequencer.start();
		
		User u1 = new User("titi", "titi", 1254, 1460, new Free(), new CarteBancaire());
		User u2 = new User("toto", "toto", 1254, 0, new Free(), new CarteBancaire());
		listeUtilisateur.add(u1);
		listeUtilisateur.add(u2);
		u1.paye(10);
		u2.paye(10);
		for(User u : listeUtilisateur) {
			System.out.println(u);
		}
		u1.play(10);
		u1.addTolisteFavoris("gege le palet");
	}

}
