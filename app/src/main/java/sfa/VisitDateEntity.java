package sfa;

/**
 * Created by beiyong14 on 2016/3/23.
 */
public class VisitDateEntity {
    private String userCode;
    private String customerCode;
    private String visitDate;
    private String nextVisitDate;
    private String endDate;

    public VisitDateEntity(String userCode, String customerCode, String visitDate, String nextVisitDate, String endDate) {
        this.userCode = userCode;
        this.customerCode = customerCode;
        this.visitDate = visitDate;
        this.nextVisitDate = nextVisitDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "VisitDateEntity{" +
                "userCode='" + userCode + '\'' +
                ", customerCode='" + customerCode + '\'' +
                ", visitDate='" + visitDate + '\'' +
                ", nextVisitDate='" + nextVisitDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    public String getNextVisitDate() {
        return nextVisitDate;
    }

    public void setNextVisitDate(String nextVisitDate) {
        this.nextVisitDate = nextVisitDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
