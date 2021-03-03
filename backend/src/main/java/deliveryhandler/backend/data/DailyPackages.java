package deliveryhandler.backend.data;

public class DailyPackages {

    private String id;
    private String date;
    private Package packageInfo;

    public Package getPackageInfo() {
        return packageInfo;
    }

    public void setPackageInfo(Package packageInfo) {
        this.packageInfo = packageInfo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
