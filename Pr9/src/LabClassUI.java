import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabClassUI extends JFrame {

    JButton button1 = new JButton("Отсортировать");
    JButton button2 = new JButton("Поиск по ФИО");
    LabClassDriver obj = new LabClassDriver();
    JLabel lbl1 = new JLabel("");

    LabClassUI() throws EmptyStringException, StudentNotFoundException
    {
        super("Practice 9");
        setLayout(null);
        setSize(235, 150);
        button1.setBounds(20,15, 180,25);
        button2.setBounds(20,50, 180,25);
        lbl1.setBounds(20,85,180,20);
        lbl1.setHorizontalAlignment(SwingConstants.CENTER);
        add(button1);
        add(button2);
        add(lbl1);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                obj.insertSort();
                lbl1.setText("Отсортировано!");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txt = JOptionPane.showInputDialog(null,"Введите ФИО: ");
                if (obj.findStudent(txt)==true)
                    lbl1.setText("Найден студент с id "+obj.getId(txt));
                else try {
                    if (txt.equals(""))
                        throw new EmptyStringException("Введена пустая строка!");
                    throw new StudentNotFoundException("Студент с такой фамилией не найден!");
                } catch (StudentNotFoundException | EmptyStringException ex) {
                    lbl1.setText(ex.getMessage());
                }
            }
        });
    }
}