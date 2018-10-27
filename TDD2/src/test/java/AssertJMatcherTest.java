import api.ToDo;
import business.ToDoSpring;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class AssertJMatcherTest {
    //http://joel-costigliola.github.io/assertj/core-8/api/

    @Test
    public void testCharacters() {
        assertThat('a').isEqualTo('a');

        assertThat('c')
                .isNotEqualTo('a')
                .inUnicode()
                .isGreaterThanOrEqualTo('b')
                .isLowerCase()
                .isLessThanOrEqualTo('d')
                .isLowerCase();

        // assertions will fail
//        assertThat('a').isEqualTo('b');
//        assertThat('a').isEqualTo('A');

    }

    @Test
    public void testList() {
        List<String> list = Arrays.asList("1", "2", "3");

        assertThat(list).isNotEmpty();
        assertThat(list).startsWith("1");

        assertThat(list)
                .isNotEmpty()
                .contains("1")
                .doesNotContainNull()
                .containsSequence("2", "3");

        assertThat(list)
                .contains("1", "2", "3")
                .doesNotContain("4");
        ;
    }

    @Test
    public void testClass() {
        assertThat(ToDo.class)
                .isInterface()
                .isPublic()
                .isNotFinal();
        assertThat(Exception.class).isAssignableFrom(NoSuchElementException.class);
        assertThat(ToDoSpring.class).isNotInterface();
    }

    @Test
    public void testFileAssertWithSoflty() throws IOException {
        File tmpFile = File.createTempFile("tmp", "txt");
        File tmpDir = Files.createTempDirectory("tmpDir").toFile();

        // assertions will pass
        assertThat(tmpFile).exists();
        assertThat(tmpDir).exists();

        tmpFile.delete();
        tmpDir.delete();
        SoftAssertions.assertSoftly(softly -> {
            // assertions will fail
            softly.assertThat(tmpFile).exists();
            softly.assertThat(tmpDir).exists();
        });
    }
}

