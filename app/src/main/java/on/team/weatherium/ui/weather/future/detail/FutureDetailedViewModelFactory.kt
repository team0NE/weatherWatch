package on.team.weatherium.ui.weather.future.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import on.team.weatherium.data.provider.UnitProvider
import on.team.weatherium.data.repository.FutureWeatherRepository
import org.threeten.bp.LocalDate

class FutureDetailedViewModelFactory(
    private val detailedDate: LocalDate,
    private val futureWeatherRepository: FutureWeatherRepository,
    private val unitProvider: UnitProvider
) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return FutureDetailedWeatherViewModel(detailedDate, futureWeatherRepository, unitProvider) as T
    }
}