class Solution {
    public String defangIPaddr(String address) {
        String s="[.]";
        address=address.replace(".",s);
        return address;
    }
}