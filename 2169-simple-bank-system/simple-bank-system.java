class Bank {
    private long[] balance;
    private int n;
    public Bank(long[] balance) {
        this.balance = balance;
        n = balance.length;
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if((account1 <= n && account1 >= 1) && (account2 <= n && account2 >= 1)) {
            if(money <= balance[account1 - 1]) {
                balance[account1 - 1] -= money;
                balance[account2 - 1] += money;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
    
    public boolean deposit(int account, long money) {
        if(account <= n && account >= 1) {
            balance[account - 1] += money;
            return true;
        }
        return false;
    }
    
    public boolean withdraw(int account, long money) {
        if (account <= n && account >= 1) {  
            if ((balance[account - 1] - money) < 0) {
                return false;
            } else if (balance[account - 1] - money >= 0) {
                balance[account - 1] -= money;
                return true;
            }
        } 

        return false;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */