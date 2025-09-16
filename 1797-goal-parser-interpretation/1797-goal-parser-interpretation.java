class Solution {
    public String interpret(String command) {
        String s="()";String s1="(al)";
        command=command.replace(s,"o");
        command=command.replace(s1,"al");
        return command;
    }
}