package uiTest;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class DASDS extends JPanel {

	/**
	 * Create the panel.
	 */
	public DASDS() {
		setLayout(new BorderLayout(0, 0));
		
		hotelByTypePanel hotelByTypePanel_ = new hotelByTypePanel();
		add(hotelByTypePanel_, BorderLayout.CENTER);
		
		hotelTypeNamePanel hotelTypeNamePanel_ = new hotelTypeNamePanel();
		add(hotelTypeNamePanel_, BorderLayout.NORTH);
		hotelTypeNamePanel_.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

	}

}
