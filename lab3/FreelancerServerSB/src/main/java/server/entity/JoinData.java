package server.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class JoinData {

    @Id
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public int getAveragebid() {
        return averagebid;
    }

    public void setAveragebid(int averagebid) {
        this.averagebid = averagebid;
    }

    public String getSkills_required() {
        return skills_required;
    }

    public void setSkills_required(String skills_required) {
        this.skills_required = skills_required;
    }

    public String getBudgetrange() {
        return budgetrange;
    }

    public void setBudgetrange(String budgetrange) {
        this.budgetrange = budgetrange;
    }

    public int getNumber_of_bids() {
        return number_of_bids;
    }

    public void setNumber_of_bids(int number_of_bids) {
        this.number_of_bids = number_of_bids;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getWorker() {
        return worker;
    }

    public void setWorker(String worker) {
        this.worker = worker;
    }

    public Date getEstimated_completion_date() {
        return estimated_completion_date;
    }

    public void setEstimated_completion_date(Date estimated_completion_date) {
        this.estimated_completion_date = estimated_completion_date;
    }

    public int getProjectid() {
        return projectid;
    }

    public void setProjectid(int projectid) {
        this.projectid = projectid;
    }

    public String getFreelancer() {
        return freelancer;
    }

    public void setFreelancer(String freelancer) {
        this.freelancer = freelancer;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public int getBidamount() {
        return bidamount;
    }

    public void setBidamount(int bidamount) {
        this.bidamount = bidamount;
    }

    private String title;
    private String description;
    private String open;
    private int averagebid;
    private String skills_required;
    private String budgetrange;
    private int number_of_bids;
    private String employer;
    private String worker;
    private Date estimated_completion_date;
    private int projectid;
    private String freelancer;
    private int period;
    private int bidamount;

}
