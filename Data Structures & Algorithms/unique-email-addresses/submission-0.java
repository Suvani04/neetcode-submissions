class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set= new HashSet<>();
        for(String email: emails){
            int at= email.indexOf('@');
            String local = email.substring(0,at);
            String domain = email.substring(at+1);

            // int plus= local.indexOf('+');
            // local= local.replace('+', ' ');
            int plus = local.indexOf('+');
            if (plus != -1) {
                local = local.substring(0, plus);
            }

            local = local.replace("." , "");

            String finalEmail = local + "@" + domain;

            set.add(finalEmail);

        }
        return set.size();
    }
}