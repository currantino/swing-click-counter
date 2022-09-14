import javax.swing.*;
import java.awt.*;

public class ClickCounter {
    private JPanel panel;
    private JFrame frame;
    private JButton button;
    private JLabel label;
    private int counter;

    private ClickCounter() {
        frame = new JFrame();
        panel = new JPanel();
        button = new JButton("click me!");
        label = new JLabel(getLabelText(counter));
        setup();
    }

    public static void main(String[] args) {
        new ClickCounter();
    }

    private void setup() {
        button.addActionListener((actionEvent) -> {
            counter++;
            label.setText(getLabelText(counter));
        });
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);
        frame.add(panel);
        frame.setTitle("click-counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        frame.setLayout(new GridLayout());
        frame.pack();
        frame.setVisible(true);
    }

    private String getLabelText(int counter) {
        return String.format("Number of clicks: %d", counter);
    }
}
