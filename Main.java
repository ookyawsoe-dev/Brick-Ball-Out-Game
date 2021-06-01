package Game;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

public class Main {
	public Clip audioClip = null;
	public static Clip clip = null;
//	public Clip ballClip = null;
//	public static Clip bClip = null;

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		JFrame obj = new JFrame();
		Gameplay gamePlay = new Gameplay();

		obj.setBounds(10, 10, 700, 600);
		obj.setTitle("Brick Breaker Game!                                                Developed by Mr.Kyaw Soe");
		obj.setResizable(false);
		obj.setLocation(200, 50);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);
		obj.setVisible(true);
		Main main = new Main();
		main.audio();
		//main.ballSound();
		//bClip.stop();
		clip.stop();
	}

	public void audio() throws IOException {
		String name = "src/banana.wav";
		try {
			clip = AudioSystem.getClip();
			this.audioClip = clip;
			AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File((name)));
			File file = new File(name);
			inputStream = AudioSystem.getAudioInputStream(file);
			clip = AudioSystem.getClip();
			clip.open(inputStream);
			clip.loop(Clip.LOOP_CONTINUOUSLY);

		} catch (Exception e) {
			//System.out.println("Error: Can't locate sound.");
			e.printStackTrace();
		}
	}
//	public void ballSound() {
//		String name = "src/sms_bells_tone.wav";
//		try {
//			bClip = AudioSystem.getClip();
//			this.ballClip = bClip;
//			AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File((name)));
//			File file = new File(name);
//			inputStream = AudioSystem.getAudioInputStream(file);
//			bClip = AudioSystem.getClip();
//			bClip.open(inputStream);
//			clip.loop(Clip.LOOP_CONTINUOUSLY);
//
//		} catch (Exception e) {
//			//System.out.println("Error: Can't locate sound.");
//			e.printStackTrace();
//		}
//	}

}
