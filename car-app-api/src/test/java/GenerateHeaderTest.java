import com.sky.uk.carapp.controller.AppController;
import com.sky.uk.carapp.service.GenerateHeader;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import java.util.Objects;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GenerateHeaderTest {
    GenerateHeader generateHeader = new GenerateHeader();

    @Test
    public void testValidUUIDLength() {

        assertEquals(UUID.randomUUID().toString().length(),
                Objects.requireNonNull(generateHeader.generateRandomHeader().getFirst("x-sky-request-id")).length());

    }
    @Test
    public void testValidUUIDRegex() throws Exception {
        String regexUUIDPattern = "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$";
        assertTrue(generateHeader.generateRandomHeader().getFirst("x-sky-request-id").matches(regexUUIDPattern));
    }

}
