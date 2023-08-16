package com.techreturners.exercise003;

public class Exercise003 {
    private int iceCreamCode;
    private String[] iceCreamFlavours;

    // Constructor which initialises iceCreamFlavours String list to all icecream
    //flavours
    public Exercise003(){
        iceCreamFlavours = new String[] { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };
    }

    /*
    This method returns the iceCreamCode depending on iceCreamFlavour by
    matching it with existing list of iceCreamFlavours. If flavour does
    not exist then code of -1 is returned.
     */
    int getIceCreamCode(String iceCreamFlavour) {

        if (iceCreamFlavour == null || iceCreamFlavour.isEmpty()){
            return -1;
        }
        for (int i=0;i<this.iceCreamFlavours.length;i++){
            this.iceCreamCode = i;
            if (this.iceCreamFlavours[i].toLowerCase().equals(iceCreamFlavour.toLowerCase()))
                return this.iceCreamCode;
        }
        return -1;
    }

    // Returns list of all iceCreamFlavours
    String[] iceCreamFlavours() {
        return iceCreamFlavours;
    }

}
