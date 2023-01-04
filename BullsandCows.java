class Solution {
    public String getHint(String secret, String guess) {
       int bull=0,cow=0;
        char secret_c[] = new char [secret.length()];
        char guess_c[] = new char [guess.length()];
        secret.getChars(0, secret.length(), secret_c, 0);
        guess.getChars(0, guess.length(), guess_c, 0);
        for(int i=0;i<secret_c.length;i++){
            if(secret_c[i]==guess_c[i]){
                bull++;
                secret_c[i]='x';
                guess_c[i]='x';
            }
        }
        for (int i = 0; i < secret_c.length; i++) {
            if(secret_c[i]=='x')
                continue;
            for (int j = 0; j < guess_c.length; j++) {
                if(guess_c[j]=='x')
                    continue;
                if(secret_c[i]==guess_c[j]){
                    cow++;
                    secret_c[i]='x';
                    guess_c[j]='x';
                }
            }
        }
        String res=bull+"A"+cow+"B";
        return res;
    }
}
