struct Taxi {
    placa: String,
    conductor: String,
    modelo: String,
}

impl Taxi {
    pub fn new(placa: &str, conductor: &str, modelo: &str) -> Self {
        Self {
            placa: String::from(placa),
            conductor: String::from(conductor),
            modelo: String::from(modelo),
        }
    }

    pub fn iniciar_servicio(&self) -> String {
        format!(
            "Inicia el servicio del taxi # de placa {}, con conductor {} y modelo {}",
            self.placa, self.conductor, self.modelo
        )
    }
}

fn main() {
    let taxis = vec![
        Taxi::new("M 512921", "Jose María", "Amarillo"),
        Taxi::new("MY 23122", "Raúl Tustaca", "Toyota Yaris"),
        Taxi::new("G 95821", "Nuevo Segovio", "Hyundai i10"),
    ];

    for taxi in &taxis {
        println!("{}", taxi.iniciar_servicio())
    }
}
