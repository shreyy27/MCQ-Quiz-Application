package screens;



import constants.CommonConstants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class TitleScreenGui extends JFrame {
    private JComboBox categoriesMenu;
    private JTextField numOfQuestionsTextField;

    public TitleScreenGui(){
        // call the constructor of the superclass with the title of "Title Screen"
        super("Title Screen");

        // set the size of the JFrame to 400 pixels wide and 565 pixels tall
        setSize(400, 565);

        // set the layout manager of the frame to null, allowing manual positioning of the components
        setLayout(null);

        // set the frame to be centered on the screen when displayed
        setLocationRelativeTo(null);

        // disable resizing of the frame by the user
        setResizable(false);

        // set the default close operation of the frame to exit after the application has been closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // change the color
        getContentPane().setBackground(CommonConstants.LIGHT_BLUE);

        addGuiComponents();
    }
    private void addGuiComponents(){
        // title

        JLabel titleLabel = new JLabel("Quiz Game!");
        titleLabel.setFont(new Font("Arial", Font.BOLD,36));
        titleLabel.setBounds(0,20,390,43);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setForeground(CommonConstants.BRIGHT_YELLOW);
        add(titleLabel);

        // choose category
        JLabel chooseCategoryLabel = new JLabel("Choose a category");
        chooseCategoryLabel.setFont(new Font("Arial", Font.BOLD,16));
        chooseCategoryLabel.setBounds(0,90,400,43);
        chooseCategoryLabel.setHorizontalAlignment(SwingConstants.CENTER);
        chooseCategoryLabel.setForeground(CommonConstants.BRIGHT_YELLOW);
        add(chooseCategoryLabel);

        // category drop-down menu
        String[] categories = new String[]{"Math","Programming","History"};
        categoriesMenu = new JComboBox(categories);
        categoriesMenu.setBounds(20,130,337,45);
        categoriesMenu.setForeground(CommonConstants.DARK_BLUE);
        add(categoriesMenu);


        // number of questions label
        JLabel numOfQuestionsLabel = new JLabel("Number of Questions");
        numOfQuestionsLabel.setFont(new Font("Arial", Font.BOLD,16));
        numOfQuestionsLabel.setBounds(20,190,172,20);
        numOfQuestionsLabel.setHorizontalAlignment(SwingConstants.CENTER);
        numOfQuestionsLabel.setForeground(CommonConstants.BRIGHT_YELLOW);
        add(numOfQuestionsLabel);

        // number of questiosn text input
        numOfQuestionsTextField = new JTextField("10");
        numOfQuestionsTextField.setFont(new Font("Arial", Font.BOLD,16));
        numOfQuestionsTextField.setBounds(200,190,148,26);

        numOfQuestionsTextField.setForeground(CommonConstants.DARK_BLUE);
        add(numOfQuestionsTextField);


        // start btn
        JButton startButton = new JButton("Start");
        startButton.setFont(new Font("Arial",Font.BOLD,16));
        startButton.setBounds(65,290,262,45);
        startButton.setBackground(CommonConstants.BRIGHT_YELLOW);
        startButton.setForeground(CommonConstants.LIGHT_BLUE);
        add(startButton);

        //exit btn
        JButton exitButton = new JButton("Exit");
        exitButton.setFont(new Font("Arial",Font.BOLD,16));
        exitButton.setBounds(65,350,262,45);
        exitButton.setBackground(CommonConstants.MEDIUM_RED);
        exitButton.setForeground(CommonConstants.BLACK);
        add(exitButton);

        // ques btn
        JButton CreateAQuestionButton = new JButton("Create a Question");
        CreateAQuestionButton.setFont(new Font("Arial",Font.BOLD,16));
        CreateAQuestionButton.setBounds(65,420,262,45);
        CreateAQuestionButton.setBackground(CommonConstants.LIGHT_GREEN);
        CreateAQuestionButton.setForeground(CommonConstants.BLACK);
        add(CreateAQuestionButton);


    }
}
