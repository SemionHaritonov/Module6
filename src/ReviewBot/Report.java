package ReviewBot;

import java.time.LocalDate;

public class Report {

    private Long id;

    private String studentUserName;

    private Integer hours;

    private LocalDate date;

    private String title;

    public Report(long id, String studentUserName, Integer hours, LocalDate date, String title) {
        this.id = id;
        this.date = date;
        this.hours = hours;
        this.studentUserName = studentUserName;
        this.title = title;
    }
    public Long getId() {
        return id;
    }
    public String getStudentUserName() {
        return studentUserName;
    }
    public Integer getHours() {
        return hours;
    }
    public LocalDate getLocalDate() {
        return date;
    }
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return getStudentUserName().toString() + "\n"
                + getLocalDate().toString() + "\n"
                + getHours() + "\n"
                + getTitle();
    }
}
