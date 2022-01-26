package Avalara.SDK;

public enum AvaTaxEnvironment {
    /**
     * Represents the sandbox environment, https://sandbox-rest.avatax.com
     */
    Sandbox,
    /**
     * Represents the production environment, https://rest.avatax.com
     */
    Production,
    /**
     * Represents a test environment, where the URL is passed in as part of the Configuration class.
     */
    Test
}
