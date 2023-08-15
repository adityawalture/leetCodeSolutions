class Solution {
    public String addBinary(String a, String b) {
        java.math.BigInteger numA = new java.math.BigInteger(a,2);
        java.math.BigInteger numB = new java.math.BigInteger(b,2);
        return(numA.add(numB)).toString(2);
    }
}