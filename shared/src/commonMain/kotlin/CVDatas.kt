package CVDatas

import kotlinx.datetime.Clock
import kotlinx.datetime.LocalDate
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

data class CVDatas(
    val nom: String,
    val prenom: String,
    val dateNaissance: LocalDate,
    val adresse: String,
    val email: String,
    val numeroTelephone: String,
    val formations: List<Formation>,
    val experiences: List<Experience>,
    val langages: List<Language>,
    val competences: List<Competence>,
    val interets: List<CentreInteret>,
    val linkedin : String,

) {
    fun calculerAge(): Int {
        val aujourdhui = Clock.System.now().toLocalDateTime(TimeZone.UTC)
        val age = aujourdhui.year - dateNaissance.year
        return age
    }
}

data class Formation(
    val diplome: String,
    val etablissement: String,
    val annee: Int
)
data class Experience(
    val poste: String,
    val entreprise: String,
    val anneeDebut: Int,
    val anneeFin: Int,
    val description: String
)

data class Language(
    val nom: String,
)

data class Competence(
    val nom: String,
)

data class CentreInteret(
    val nom: String,
)


// Exemple d'objet CV
val adrienCV = CVDatas(
    nom = "Poulain",
    prenom = "Adrien",
    dateNaissance = LocalDate(2001, 2, 6),
    adresse = "8 rue Alexandre Desrousseaux",
    email = "adrienpoulain11@email.com",
    numeroTelephone = "07-88-21-66-99",
    formations = listOf(
        Formation("Baccalauréat STI2D", "Lycée Edouard Branly", 2019),
        Formation("DUT Informatique", "Université du Littoral Côte d'Opale", 2021),
        Formation("Licence PRO Développement Internet et Mobile", "Université du Littoral Côte d'Opale", 2022),
        Formation("Mastère Management de projet Digital", "EFFICOM", 2023),
        Formation("Expert en ingénierie du développement et en architecture logicielle", "EFFICOM", 2024),
    ),
    experiences = listOf(
        Experience("Développeur WEB", "SOFIDEST", 2022, 2024, "Contrat en Alternance. Refonte du backoffice en Symfony"),
        Experience("Développeur Full Stack", "Data Legal Drive", 2021, 2022, "Contrat en Alternance. Création Snippet en JS"),
        Experience("Développeur R", "Data Legal Drive", 2021, 2021, "Stage. Développement d'une application de statistique en R"),
    ),
    langages = listOf(
        Language("Anglais"),
        Language("Allemand"),
        Language("Japonnais"),
    ),
    competences = listOf(
        Competence("Audacieux"),
        Competence("Travail d'équipe"),
        Competence("Autonome"),
    ),
    interets = listOf(
        CentreInteret("Photographie"),
        CentreInteret("Jeux Vidéo"),
        CentreInteret("Sport Automobile"),
    ),
    linkedin =  "linkedin.com/in/adrien-poulain",
)
