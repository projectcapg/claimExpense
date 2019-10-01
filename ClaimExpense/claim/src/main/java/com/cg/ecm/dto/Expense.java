package com.cg.ecm.dto;

/**
 * Represents an Expense
 * 
 * @author Durgesh Singh
 * @author Hari Galla
 * @author Soham Kasar
 * @author Lalit Kumar
 * @author Amanjot Singh
 * @author Adarsh Gupta
 * @author Vivek Kumar
 * @author Amit Yadav
 * @version 1.0
 */
public class Expense {

    private int expenseCode;
    private String expenseType;
    private String expenseDescription;

    /**
     * Gets the Expense's Code.
     * 
     * @return A Integer representing the Expense's Code
     */
    public int getExpenseCode() {
        return expenseCode;
    }

    /**
     * Sets the Expense's Code.
     * 
     * @param expenseCode A Integer containing the Expense's Code.
     */
    public void setExpenseCode(int expenseCode) {
        this.expenseCode = expenseCode;
    }

    /**
     * Gets the Expense's Type.
     * 
     * @return A string representing the Expense's Type.
     */
    public String getExpenseType() {
        return expenseType;
    }

    /**
     * Sets the Expense's Type.
     * 
     * @param expenseType A String containing the Expense's Type.
     */
    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }

    /**
     * Gets the Expense's Description.
     * 
     * @return A String representing the Expense's Description.
     */
    public String getExpenseDescription() {
        return expenseDescription;
    }

    /**
     * Sets the Expense's Description.
     * 
     * @param expenseDescription A String containing the Expense's Description.
     */
    public void setExpenseDescription(String expenseDescription) {
        this.expenseDescription = expenseDescription;
    }

    /**
     * Returns The Expense Details
     * 
     * @return a string representing the details about Expense
     */
    @Override
    public String toString() {
        return "Expense [expenseCode=" + expenseCode + ", expenseType=" + expenseType + ", expenseDescription="
                + expenseDescription + "]";
    }

    /**
     * Creates an Expense with the specified Code.
     * 
     * @param expenseCode        The Expense's Code.
     * @param expenseType        The Expense's Type.
     * @param expenseDescription The Expense's Description.
     */
    public Expense(int expenseCode, String expenseType, String expenseDescription) {
        super();
        this.expenseCode = expenseCode;
        this.expenseType = expenseType;
        this.expenseDescription = expenseDescription;
    }

    /**Create a Expense without any Details
     * 
     */
    public Expense() {
        super();
    }
}