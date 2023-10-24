class Solution {
    public String intToRoman(int num) {
        // String n=Integer.toString(num);
        StringBuilder s=new StringBuilder();

        while (num>=1000){
            s.append("M");
            num=num-1000;
        }
        if(num>=900){
            s.append("CM");
            num=num-900;
        }
        else if(num>=500){
            s.append("D");
            num=num-500;
        }
        else if(num>=400){
            s.append("CD");
            num=num-400;
        }
        while (num>=100){
            s.append("C");
            num=num-100;
        }
        if(num>=90){
            s.append("XC");
            num=num-90;
        }
        else if(num>=50){
            s.append("L");
            num=num-50;
        }
        else if(num>=40){
            s.append("XL");
            num=num-40;
        }
        while (num>=10){
            s.append("X");
            num=num-10;
        }
        if(num>=9){
            s.append("IX");
            num=num-9;
        }
        else if(num>=5){
            s.append("V");
            num=num-5;
        }
        else if(num>=4){
            s.append("IV");
            num=num-4;
        }
        while (num>=1){
            s.append("I");
            num=num-1;
        }
        return s.toString();
    }
}