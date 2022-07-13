import com.sky.uk.carapp.model.ViewModel;
import org.junit.jupiter.api.Test;

import java.util.Objects;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ViewModelTest {

    @Test
    public void TestValidUUIDLength() {

        ViewModel viewModel = new ViewModel();

        assertEquals(UUID.randomUUID().toString().length(),
                Objects.requireNonNull(viewModel.generateRandomHeader().getFirst("x-sky-request-id")).length());

    }

    @Test
    public void TestValidUUIDRegex() throws Exception {

        ViewModel viewModel = new ViewModel();

        String regexUUIDPattern = "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$";
        assertTrue(viewModel.generateRandomHeader().getFirst("x-sky-request-id").matches(regexUUIDPattern));
    }
}
