document.addEventListener('DOMContentLoaded', function() {
    const apiKey = '0ed2ac9117dea2b296d08ddcd313309d';

    // Города
    const cities = ['Almaty', 'Nur-Sultan', 'Shymkent', 'Karaganda', 'Aktobe'];

    // Функция для получения данных о погоде для заданного города
    function getWeather(city) {
        const apiUrl = `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${apiKey}`;

        fetch(apiUrl)
            .then(response => response.json())
            .then(data => {
                const weatherDiv = document.getElementById(`weather-${city.toLowerCase()}`);

                if (data && data.main) {
                    const temperature = Math.round(data.main.temp - 273.15);
                    const description = data.weather[0].description;
                    const cityName = data.name;

                    weatherDiv.innerHTML = `${temperature}°C, ${description}`;
                } else {
                    console.error(`Error fetching weather data for ${city}: Invalid or incomplete data received.`);
                    weatherDiv.innerHTML = `Error fetching weather data for ${city}.`;
                }
            })
            .catch(error => {
                console.error(`Error fetching weather data for ${city}:`, error);
                document.getElementById(`weather-${city.toLowerCase()}`).innerHTML = `Error fetching weather data for ${city}.`;
            });
    }

    // Получаем данные о погоде для каждого города
    cities.forEach(city => {
        getWeather(city);
    });
});
