package screens;

import constants.CommonConstants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class CreateQuestionScreenGui extends JFrame {
    private JTextArea questionTextArea;
    private JTextField categoryTextField;
    private JTextField[] answerTextFields;
    private JRadioButton[] answerRadioButtons;
    private ButtonGroup buttonGroup;



    public CreateQuestionScreenGui(){
        super("Create a question");
        setSize(850,565);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(CommonConstants.LIGHT_BLUE);

        answerRadioButtons = new JRadioButton[4];
        answerTextFields = new JTextField[4];
        buttonGroup = new ButtonGroup();

        addGuiComponents();
    }
    public void addGuiComponents(){
        // title label
        JLabel titleLabel = new JLabel("Create your own Quiz");
        titleLabel.setFont(new Font("Arial", Font.BOLD,24));
        titleLabel.setBounds(50,15,310,29);
        titleLabel.setForeground(CommonConstants.LIGHT_BLUE);
        add(titleLabel);

        // question label
        JLabel questionLabel = new JLabel("Question: ");
        questionLabel.setFont(new Font("Arial", Font.BOLD,16));
        questionLabel.setBounds(50,60,90,20);
        questionLabel.setForeground(CommonConstants.BLACK);
        add(questionLabel);


        // question text area
        questionTextArea = new JTextArea();
        questionTextArea.setFont(new Font("Arial", Font.BOLD,24));
        questionTextArea.setBounds(50,90,310,110);
        questionTextArea.setForeground(CommonConstants.DARK_BLUE);
        questionTextArea.setLineWrap(true);
        questionTextArea.setWrapStyleWord(true);
        add(questionTextArea);


        // category label
        JLabel categoryLabel = new JLabel("Category: ");
        categoryLabel.setFont(new Font("Arial", Font.BOLD,16));
        categoryLabel.setBounds(50,250,93,20);
        categoryLabel.setForeground(CommonConstants.BRIGHT_YELLOW);
        add(categoryLabel);


        // category Text input
        categoryTextField = new JTextField();
        categoryTextField.setFont(new Font("Arial", Font.BOLD,16));
        categoryTextField.setBounds(50,280,310,36);
        categoryTextField.setForeground(CommonConstants.DARK_BLUE);
        add(categoryTextField);

        addAnswerComponent();

        // submit button
        JButton submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Arial", Font.BOLD,16));
        submitButton.setBounds(300,450,262,45);
        submitButton.setForeground(CommonConstants.DARK_BLUE);
        submitButton.setBackground(CommonConstants.BRIGHT_YELLOW);
        add(submitButton);

        // goback laberl
        JLabel goBackLabel = new JLabel("Go back");
        goBackLabel.setFont(new Font("Arial", Font.BOLD,16));
        goBackLabel.setBounds(300,500,262,20);
        goBackLabel.setForeground(CommonConstants.BRIGHT_YELLOW);
        goBackLabel.setHorizontalAlignment(SwingConstants.CENTER);
        goBackLabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                TitleScreenGui titleScreenGui = new TitleScreenGui();
                titleScreenGui.setLocationRelativeTo(CreateQuestionScreenGui.this);
                CreateQuestionScreenGui.this.dispose();
                titleScreenGui.setVisible(true);
            }
        });
        add(goBackLabel);
    }



    public void addAnswerComponent(){
        // vertical spacing between each answer component
        int verticalSpacing = 100;

        //   4 answer labels, 4 radio buttons, and 4 text input fields
        for(int i = 0; i < 4; i++){
            // answer label
            JLabel answerLabel = new JLabel("Answer #" + (i + 1));
            answerLabel.setFont(new Font("Arial", Font.BOLD ,16));
            answerLabel.setBounds(470, 60 + (i * verticalSpacing), 93, 20);
            answerLabel.setForeground(CommonConstants.BRIGHT_YELLOW);
            add(answerLabel);

            // radio button
            answerRadioButtons[i] = new JRadioButton();
            answerRadioButtons[i].setBounds(440, 100 + (i * verticalSpacing), 21, 21);
            answerRadioButtons[i].setBackground(null);
            buttonGroup.add(answerRadioButtons[i]);
            add(answerRadioButtons[i]);

            // answer text input field
            answerTextFields[i] = new JTextField();
            answerTextFields[i].setBounds(470, 90 + (i * verticalSpacing), 310, 36);
            answerTextFields[i].setFont(new Font("Arial", Font.PLAIN, 16));
            answerTextFields[i].setForeground(CommonConstants.DARK_BLUE);
            add(answerTextFields[i]);
        }

        // give a default value to the first radio button
        answerRadioButtons[0].setSelected(true);
    }


}




