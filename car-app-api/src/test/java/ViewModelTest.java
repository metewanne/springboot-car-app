import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ViewModelTest {

    @Test
    public void TestValidUUIDLength() {
        assertThat(UUID.randomUUID().toString().length()).isEqualTo(36);
    }

    @Test
    public void TestValidUUIDRegex() throws Exception {
        String regexUUIDPattern = "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$";
        assertThat(UUID.randomUUID().toString()).matches(regexUUIDPattern);
    }
}
