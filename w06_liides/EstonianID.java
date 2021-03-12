public class EstonianID implements PersonalCodeBehaviour {
    private String code;

    public EstonianID(String code){
        this.code = code;
    }

    @Override
    public String getGender() {
        int gender = Integer.parseInt(code.substring(0, 1));
        if(gender % 2 == 0){
            return "Naine";
        } else {
            return "Mees";
        }

        // alternatiiv if-idele:
        //return gender % 2 == 0 ? "Sugu: Naine" : "Sugu: Mees";
    }

    @Override
    public int getFullYear() {
        int fullYear = Integer.parseInt(code.substring(1, 3));
        if(fullYear < 21){
            return 2000 + fullYear;
        } else {
            return 1900 + fullYear;
        }

        // alternatiiv:
        // int year = 1800 + (Integer.parseInt(code.substring(0,1))/2)*100+(Integer.parseInt(code.substring(1,3)));
    }

    @Override
    public String getDOB() {
        int fullYear = Integer.parseInt(code.substring(1, 3));
        int fullMonth = Integer.parseInt(code.substring(3, 5));
        int fullDay = Integer.parseInt(code.substring(5, 7));
        if(fullYear < 21){
            return fullDay + "." + fullMonth + "." + (2000 + fullYear);
        } else {
            return fullDay + "." + fullMonth + "." + (1900 + fullYear);
        }
    }

    @Override
    public int getAge() {
        int fullYear = Integer.parseInt(code.substring(1, 3));
        if(fullYear < 21){
            return 21 - fullYear;
        } else {
            return 2000 + fullYear;
        }
    }
}
