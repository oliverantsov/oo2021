public class FinnishID implements PersonalCodeBehaviour {
    private String code;

    public FinnishID(String code){
        this.code = code;
    }

    @Override
    public String getGender() {
        int gender = Integer.parseInt(code.substring(7, 10));
        if(gender % 2 == 0){
            return "Naine";
        } else {
            return "Mees";
        }
    }

    @Override
    public int getFullYear() {
        int fullYear = Integer.parseInt(code.substring(4, 6));
        char century = code.charAt(6);
        if(century == '+'){
            return 1800 + fullYear;
        } else if(century == '-'){
            return 1900 + fullYear;
        } else {
            return 2000 + fullYear;
        }
    }

    @Override
    public String getDOB() {
        int fullYear = Integer.parseInt(code.substring(4, 6));
        int fullMonth = Integer.parseInt(code.substring(2, 4));
        int fullDay = Integer.parseInt(code.substring(0, 2));
        char century = code.charAt(6);

        if(century == '+'){
            return fullDay + "." + fullMonth + "." + (1800 + fullYear);
        } else if(century == '-'){
            return fullDay + "." + fullMonth + "." + (1900 + fullYear);
        } else {
            return fullDay + "." + fullMonth + "." + (2000 + fullYear);
        }
    }

    @Override
    public String getMonth() {
        int fullMonth = Integer.parseInt(code.substring(2, 4));
        return "Kuu: " + fullMonth;
    }

    @Override
    public String getDay() {
        int fullDay = Integer.parseInt(code.substring(0, 2));
        return "Päev: " + fullDay;
    }

}
