package ru.mirea.task21;
import java.util.Date;
public class BS {
    public int accountNumb;
    public BP productType;
    public AddSer AddSer;
    public Date openingDate;
    public Date closingDate;

    BS(int acNumb, BP bp, AddSer adSer) {
        accountNumb = acNumb;
        productType = bp;
        AddSer = adSer;
    }
    BS(int acNumb, BP bp, AddSer adSer, Date opDate, Date clDate){
        accountNumb = acNumb;
        productType = bp;
        AddSer = adSer;
        openingDate = opDate;
        closingDate = clDate;
    }
    public int getAccountNumb() {
        return accountNumb;
    }
    public void setAccountNumb(int accountNumb) {
        this.accountNumb = accountNumb;
    }
    public BP getProductType() {
        return productType;
    }
    public void setProductType(BP productType) {
        this.productType = productType;
    }
    public AddSer getAddSer() {
        return AddSer;
    }
    public void setAddSer(AddSer AddSer) {
        this.AddSer = AddSer;
    }
    public Date getOpeningDate() {
        return openingDate;
    }
    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }
    public Date getClosingDate() {
        return closingDate;
    }
    public void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }
}
