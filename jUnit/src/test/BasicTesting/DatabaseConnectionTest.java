package BasicTesting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {
    DatabaseConnection db;

    /**
     * Runs before each test.
     * Initializes a new DatabaseConnection instance and establishes a connection.
     */
    @BeforeEach
    void setUp(){
        db = new DatabaseConnection();
        db.connect();
    }

    /**
     * Runs after each test.
     * Closes the database connection to clean up resources.
     */
    @AfterEach
    void tearDown(){
        db.disconnect();
    }

    // Test to verify that the connection is successfully established.
    @Test
    void testConnectionEstablished() {
        assertTrue(db.isConnected());
    }

    // Test to verify that the connection is successfully closed.
    @Test
    void testConnectionClosed() {
        db.disconnect();
        assertFalse(db.isConnected());
    }
}