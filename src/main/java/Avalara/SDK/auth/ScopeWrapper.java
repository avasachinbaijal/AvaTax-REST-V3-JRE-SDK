package Avalara.SDK.auth;

public class ScopeWrapper {
    private String Scope = "";
    public ScopeWrapper(String scope) {
        Scope = scope;
    }

    public String getScope() {
        return Scope;
    }
}
