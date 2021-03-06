package com.sqli.workshop.viewmodel;

import com.sqli.workshop.R;
import com.sqli.workshop.bo.GhibliItem;
import com.sqli.workshop.viewmodel.GhibliViewModel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;

import static org.junit.Assert.assertEquals;

/**
 * @author Metrozal on 12/02/2018.
 */

@RunWith(RobolectricTestRunner.class)
public class GhibliViewModelTest {

    //region No Time to fix the resource problem but it should work
    @Test
    public void should_get_default_title_when_item_is_null() throws Exception {
        // Given
        GhibliViewModel model = new GhibliViewModel(null);

        // When
        final String result = model.getTitle(RuntimeEnvironment.application);

        // Then
        assertEquals(result, RuntimeEnvironment.application.getString(R.string.default_title));
    }

    @Test
    public void should_get_default_score_when_item_is_null() throws Exception {
        // Given
        GhibliViewModel model = new GhibliViewModel(null);

        // When
        final String result = model.getScore(RuntimeEnvironment.application);

        // Then
        assertEquals(result, RuntimeEnvironment.application.getString(R.string.default_score));
    }
    //endregion

    @Test
    public void should_get_default_title_when_there_is_item() throws Exception {
        // Given
        GhibliItem item = new GhibliItem();
        item.title = "This is my first title";
        GhibliViewModel model = new GhibliViewModel(item);

        // When
        final String result = model.getTitle(RuntimeEnvironment.application);

        // Then
        assertEquals(result, "Titre : This is my first title");
    }

    @Test
    public void should_get_default_score_when_there_is_item() throws Exception {
        // Given
        GhibliItem item = new GhibliItem();
        item.rt_score = "100";
        GhibliViewModel model = new GhibliViewModel(item);

        // When
        final String result = model.getScore(RuntimeEnvironment.application);

        // Then
        assertEquals(result, "Score : 100");
    }

    // TODO Continue unit tests on every ViewModel method
}
