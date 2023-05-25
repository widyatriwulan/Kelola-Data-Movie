package com.widya.submissionarchitecturecomponent.utils

import com.widya.submissionarchitecturecomponent.data.FilmEntity
import com.widya.submissionarchitecturecomponent.data.TvshowEntity
import com.widya.submissionarchitecturecomponent.data.source.remote.response.FilmResponse
import com.widya.submissionarchitecturecomponent.data.source.remote.response.TvShowResponse

object DataDummy {

    fun generateDummyMovies(): List<FilmEntity> {

        val movies = ArrayList<FilmEntity>()

        movies.add(
            FilmEntity(
                "M1",
                "Parasite",
                "All unemployed, Ki-taek's family takes peculiar interest in the wealthy and glamorous Parks for their livelihood until they get entangled in an unexpected incident.",
                "11/01/2019",
                "Comedy, Thriller, Drama",
                "Bong Joon-ho",
                "Han Jin-won",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/9PSifrJfKl8sy9tBOd5Vcg0jbN6.jpg"
            )
        )
        movies.add(
            FilmEntity(
                "M2",
                "Zack Snyder's Justice League",
                "Determined to ensure Superman's ultimate sacrifice was not in vain, Bruce Wayne aligns forces with Diana Prince with plans to recruit a team of metahumans to protect the world from an approaching threat of catastrophic proportions.",
                "03/18/2021",
                "Action, Adventure, Fantasy, Science Fiction",
               "Zack Snyder",
                "Chris Terrio",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/tnAuB8q5vv7Ax9UAEje5Xi4BXik.jpg"
            )
        )
        movies.add(
            FilmEntity(
                "M3",
                "Aquaman",
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                "12/21/2018",
                "Action, Adventure, Fantasy",
                "James Wan",
                "Will Beall, David Leslie Johnson-McGoldrick",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/5Kg76ldv7VxeX9YlcQXiowHgdX6.jpg"
            )
        )
        movies.add(
            FilmEntity(
                "M4",
                "Now You See Me 2",
                "One year after outwitting the FBI and winning the public’s adulation with their mind-bending spectacles, the Four Horsemen resurface only to find themselves face to face with a new enemy who enlists them to pull off their most dangerous heist yet.",
                "06/10/2016",
                "Thriller, Action, Comedy",
                "Jon M. Chu",
                "Ed Solomon",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/w7Q9BAqpbPHSeo6ZDYRpFGpGUxn.jpg"
            )
        )
        movies.add(
            FilmEntity(
                "M5",
                "Mulan",
                "When the Emperor of China issues a decree that one man per family must serve in the Imperial Chinese Army to defend the country from Huns, Hua Mulan, the eldest daughter of an honored warrior, steps in to take the place of her ailing father. She is spirited, determined and quick on her feet. Disguised as a man by the name of Hua Jun, she is tested every step of the way and must harness her innermost strength and embrace her true potential.",
                "09/04/2020",
                "Adventure, Fantasy",
                "Niki Caro",
                "Elizabeth Martin, Rick Jaffa , Lauren Hynek, Amanda Silver",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/aKx1ARwG55zZ0GpRvU2WrGrCG9o.jpg"
            )
        )
        movies.add(
            FilmEntity(
                "M6",
                "Avengers: Endgame",
                "After the devastating events of Avengers: Infinity War, the universe is in ruins due to the efforts of the Mad Titan, Thanos. With the help of remaining allies, the Avengers must assemble once more in order to undo Thanos' actions and restore order to the universe once and for all, no matter what consequences may be in store.",
                "04/24/2019",
                "Adventure, Science Fiction, Action",
                "Joe Russo, Anthony Russo",
                "Christopher Markus, Stephen McFeely",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/or06FN3Dka5tukK1e9sl16pB3iy.jpg"
            )
        )
        movies.add(
            FilmEntity(
                "M7",
                "Soul",
                "Joe Gardner is a middle school teacher with a love for jazz music. After a successful gig at the Half Note Club, he suddenly gets into an accident that separates his soul from his body and is transported to the You Seminar, a center in which souls develop and gain passions before being transported to a newborn child. Joe must enlist help from the other souls-in-training, like 22, a soul who has spent eons in the You Seminar, in order to get back to Earth.",
                "12/25/2020 ",
                "Family, Animation, Comedy, Drama, Music, Fantasy",
                "Kemp Powers, Pete Docter",
                "Mike Jones",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/hm58Jw4Lw8OIeECIq5qyPYhAeRJ.jpg"
            )
        )
        movies.add(
            FilmEntity(
                "M8",
                "Bohemian Rhapsody",
                "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                "11/02/2018",
                "Music, Drama, History",
                "Bryan Singer",
                "Anthony McCarten",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/lHu1wtNaczFPGFDTrjCSzeLPTKN.jpg"
            )
        )
        movies.add(
            FilmEntity(
                "M9",
                "Coco",
                "Despite his family’s baffling generations-old ban on music, Miguel dreams of becoming an accomplished musician like his idol, Ernesto de la Cruz. Desperate to prove his talent, Miguel finds himself in the stunning and colorful Land of the Dead following a mysterious chain of events. Along the way, he meets charming trickster Hector, and together, they set off on an extraordinary journey to unlock the real story behind Miguel's family history.",
                "11/22/2017",
                "Family, Animation, Fantasy, Music, Comedy, Adventure",
                "Lee Unkrich",
                "Adrian Molina, Matthew Aldrich",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/yAvisTUocxmXQZQJZ521dL9a36p.jpg"
            )
        )
        movies.add(
            FilmEntity(
                "M10",
                "Tom & Jerry",
                "Tom the cat and Jerry the mouse get kicked out of their home and relocate to a fancy New York hotel, where a scrappy employee named Kayla will lose her job if she can’t evict Jerry before a high-class wedding at the hotel. Her solution? Hiring Tom to get rid of the pesky mouse.",
                "03/10/2021",
                "Comedy, Family, Animation",
                "Tim Story",
                "",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6KErczPBROQty7QoIsaa6wJYXZi.jpg"
            )
        )
        return movies
    }

    fun generateRemoteTvshow(): List<TvShowResponse> {

        val tvshow = ArrayList<TvShowResponse>()

        tvshow.add(
            TvShowResponse(
                "tv1",
                "Arrow",
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "2012",
                "Crime, Drama, Mystery, Action & Adventure",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/8yP5bmag6M4PQC7SfNQfi9Tt9aY.jpg"
            )
        )
        tvshow.add(
            TvShowResponse(
                "tv2",
                "Invincible",
                "Mark Grayson is a normal teenager except for the fact that his father is the most powerful superhero on the planet. Shortly after his seventeenth birthday, Mark begins to develop powers of his own and enters into his father’s tutelage.",
                "2021",
                "Animation, Action & Adventure, Drama",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6nQSayZSmaDjKGMZnukfneUQnuB.jpg"
            )
        )

        tvshow.add(
            TvShowResponse(
                "tv3",
                "Given",
                "Tightly clutching his Gibson guitar, Mafuyu Satou steps out of his dark apartment to begin another day of his high school life. While taking a nap in a quiet spot on the gymnasium staircase, he has a chance encounter with fellow student Ritsuka Uenoyama, who berates him for letting his guitar's strings rust and break. Noticing Uenoyama's knowledge of the instrument, Satou pleads for him to fix it and to teach him how to play. Uenoyama eventually agrees and invites him to sit in on a jam session with his two band mates: bassist Haruki Nakayama and drummer Akihiko Kaji.",
                "2019",
                "Animation,Drama",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/pdDCcAq8RNSZNk81PXYoHNUPHjn.jpg"
            )
        )
        tvshow.add(
            TvShowResponse(
                "tv4",
                "The Good Doctor",
                "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives",
                "2017",
                "Drama",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6tfT03sGp9k4c0J3dypjrI8TSAI.jpg"
            )
        )
        tvshow.add(
            TvShowResponse(
                "tv5",
                "The Flash",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \\\"meta-human\\\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                "2014",
                "Drama, Sci-Fi & Fantasy",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/lJA2RCMfsWoskqlQhXPSLFQGXEJ.jpg"
            )
        )
        tvshow.add(
            TvShowResponse(
                "tv6",
                "Riverdale",
                "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                "2017",
                "Mystery, Drama, Crime",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/pHcNHYPg0c2vg7qay6wjJoApUgS.jpg"
            )
        )
        tvshow.add(
            TvShowResponse(
                "tv7",
                "Manifest",
                "After landing from a turbulent but routine flight, the crew and passengers of Montego Air Flight 828 discover five years have passed in what seemed like a few hours. As their new realities become clear, a deeper mystery unfolds and some of the returned passengers soon realize they may be meant for something greater than they ever thought possible.",
                "2018",
                "Drama, Mystery",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/1xeiUxShzNn8TNdMqy3Hvo9o2R.jpg"
            )
        )
        tvshow.add(
            TvShowResponse(
                "tv8",
                "Supergirl",
                "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism.",
                "2015",
                "Drama, Sci-Fi & Fantasy, Action & Adventure",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/zsaiq8ZclPuneuN7loLEbsh1ANJ.jpg"
            )
        )
        tvshow.add(
            TvShowResponse(
                "tv9",
                "Lucifer",
                "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.",
                "2016",
                "Crime, Sci-Fi & Fantasy",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/vkGnVBSNpayJ1oCfyVaMvhrim95.jpg"
            )
        )
        tvshow.add(
            TvShowResponse(
                "tv10",
                "The Promised Neverland",
                "Surrounded by a forest and a gated entrance, the Grace Field House is inhabited by orphans happily living together as one big family, looked after by their \"Mama,\" Isabella. Although they are required to take tests daily, the children are free to spend their time as they see fit, usually playing outside, as long as they do not venture too far from the orphanage — a rule they are expected to follow no matter what. However, all good times must come to an end, as every few months, a child is adopted and sent to live with their new family... never to be heard from again.",
                "2019",
                "Animation, Mystery, Sci-Fi & Fantasy, Action & Adventure, Drama",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/oBgRCpAbtMpk1v8wfdsIph7lPQE.jpg"
            )
        )
        return tvshow
    }

    fun generateRemoteMovies(): List<FilmResponse> {

        val movies = ArrayList<FilmResponse>()

        movies.add(
            FilmResponse(
                "M1",
                "Parasite",
                "All unemployed, Ki-taek's family takes peculiar interest in the wealthy and glamorous Parks for their livelihood until they get entangled in an unexpected incident.",
                "11/01/2019",
                "Comedy, Thriller, Drama",
                "Bong Joon-ho",
                "Han Jin-won",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/9PSifrJfKl8sy9tBOd5Vcg0jbN6.jpg"
            )
        )
        movies.add(
            FilmResponse(
                "M2",
                "Zack Snyder's Justice League",
                "Determined to ensure Superman's ultimate sacrifice was not in vain, Bruce Wayne aligns forces with Diana Prince with plans to recruit a team of metahumans to protect the world from an approaching threat of catastrophic proportions.",
                "03/18/2021",
                "Action, Adventure, Fantasy, Science Fiction",
                "Zack Snyder",
                "Chris Terrio",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/tnAuB8q5vv7Ax9UAEje5Xi4BXik.jpg"
            )
        )
        movies.add(
            FilmResponse(
                "M3",
                "Aquaman",
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                "12/21/2018",
                "Action, Adventure, Fantasy",
                "James Wan",
                "Will Beall, David Leslie Johnson-McGoldrick",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/5Kg76ldv7VxeX9YlcQXiowHgdX6.jpg"
            )
        )
        movies.add(
            FilmResponse(
                "M4",
                "Now You See Me 2",
                "One year after outwitting the FBI and winning the public’s adulation with their mind-bending spectacles, the Four Horsemen resurface only to find themselves face to face with a new enemy who enlists them to pull off their most dangerous heist yet.",
                "06/10/2016",
                "Thriller, Action, Comedy",
                "Jon M. Chu",
                "Ed Solomon",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/w7Q9BAqpbPHSeo6ZDYRpFGpGUxn.jpg"
            )
        )
        movies.add(
            FilmResponse(
                "M5",
                "Mulan",
                "When the Emperor of China issues a decree that one man per family must serve in the Imperial Chinese Army to defend the country from Huns, Hua Mulan, the eldest daughter of an honored warrior, steps in to take the place of her ailing father. She is spirited, determined and quick on her feet. Disguised as a man by the name of Hua Jun, she is tested every step of the way and must harness her innermost strength and embrace her true potential.",
                "09/04/2020",
                "Adventure, Fantasy",
                "Niki Caro",
                "Elizabeth Martin, Rick Jaffa , Lauren Hynek, Amanda Silver",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/aKx1ARwG55zZ0GpRvU2WrGrCG9o.jpg"
            )
        )
        movies.add(
            FilmResponse(
                "M6",
                "Avengers: Endgame",
                "After the devastating events of Avengers: Infinity War, the universe is in ruins due to the efforts of the Mad Titan, Thanos. With the help of remaining allies, the Avengers must assemble once more in order to undo Thanos' actions and restore order to the universe once and for all, no matter what consequences may be in store.",
                "04/24/2019",
                "Adventure, Science Fiction, Action",
                "Joe Russo, Anthony Russo",
                "Christopher Markus, Stephen McFeely",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/or06FN3Dka5tukK1e9sl16pB3iy.jpg"
            )
        )
        movies.add(
            FilmResponse(
                "M7",
                "Soul",
                "Joe Gardner is a middle school teacher with a love for jazz music. After a successful gig at the Half Note Club, he suddenly gets into an accident that separates his soul from his body and is transported to the You Seminar, a center in which souls develop and gain passions before being transported to a newborn child. Joe must enlist help from the other souls-in-training, like 22, a soul who has spent eons in the You Seminar, in order to get back to Earth.",
                "12/25/2020 ",
                "Family, Animation, Comedy, Drama, Music, Fantasy",
                "Kemp Powers, Pete Docter",
                "Mike Jones",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/hm58Jw4Lw8OIeECIq5qyPYhAeRJ.jpg"
            )
        )
        movies.add(
            FilmResponse(
                "M8",
                "Bohemian Rhapsody",
                "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                "11/02/2018",
                "Music, Drama, History",
                "Bryan Singer",
                "Anthony McCarten",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/lHu1wtNaczFPGFDTrjCSzeLPTKN.jpg"
            )
        )
        movies.add(
            FilmResponse(
                "M9",
                "Coco",
                "Despite his family’s baffling generations-old ban on music, Miguel dreams of becoming an accomplished musician like his idol, Ernesto de la Cruz. Desperate to prove his talent, Miguel finds himself in the stunning and colorful Land of the Dead following a mysterious chain of events. Along the way, he meets charming trickster Hector, and together, they set off on an extraordinary journey to unlock the real story behind Miguel's family history.",
                "11/22/2017",
                "Family, Animation, Fantasy, Music, Comedy, Adventure",
                "Lee Unkrich",
                "Adrian Molina, Matthew Aldrich",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/yAvisTUocxmXQZQJZ521dL9a36p.jpg"
            )
        )
        movies.add(
            FilmResponse(
                "M10",
                "Tom & Jerry",
                "Tom the cat and Jerry the mouse get kicked out of their home and relocate to a fancy New York hotel, where a scrappy employee named Kayla will lose her job if she can’t evict Jerry before a high-class wedding at the hotel. Her solution? Hiring Tom to get rid of the pesky mouse.",
                "03/10/2021",
                "Comedy, Family, Animation",
                "Tim Story",
                "",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6KErczPBROQty7QoIsaa6wJYXZi.jpg"
            )
        )
        return movies
    }

    fun generateDummyTvshow(): List<TvshowEntity> {

        val tvshow = ArrayList<TvshowEntity>()

        tvshow.add(
            TvshowEntity(
                "tv1",
                "Arrow",
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "2012",
                "Crime, Drama, Mystery, Action & Adventure",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/8yP5bmag6M4PQC7SfNQfi9Tt9aY.jpg"
            )
        )
        tvshow.add(
            TvshowEntity(
                "tv2",
                "Invincible",
                "Mark Grayson is a normal teenager except for the fact that his father is the most powerful superhero on the planet. Shortly after his seventeenth birthday, Mark begins to develop powers of his own and enters into his father’s tutelage.",
                "2021",
                "Animation, Action & Adventure, Drama",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6nQSayZSmaDjKGMZnukfneUQnuB.jpg"
            )
        )

        tvshow.add(
            TvshowEntity(
                "tv3",
                "Given",
                "Tightly clutching his Gibson guitar, Mafuyu Satou steps out of his dark apartment to begin another day of his high school life. While taking a nap in a quiet spot on the gymnasium staircase, he has a chance encounter with fellow student Ritsuka Uenoyama, who berates him for letting his guitar's strings rust and break. Noticing Uenoyama's knowledge of the instrument, Satou pleads for him to fix it and to teach him how to play. Uenoyama eventually agrees and invites him to sit in on a jam session with his two band mates: bassist Haruki Nakayama and drummer Akihiko Kaji.",
                "2019",
                "Animation,Drama",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/pdDCcAq8RNSZNk81PXYoHNUPHjn.jpg"
            )
        )
        tvshow.add(
            TvshowEntity(
                "tv4",
                "The Good Doctor",
                "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives",
                "2017",
                "Drama",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6tfT03sGp9k4c0J3dypjrI8TSAI.jpg"
            )
        )
        tvshow.add(
            TvshowEntity(
                "tv5",
                "The Flash",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \\\"meta-human\\\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                "2014",
                "Drama, Sci-Fi & Fantasy",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/lJA2RCMfsWoskqlQhXPSLFQGXEJ.jpg"
            )
        )
        tvshow.add(
            TvshowEntity(
                "tv6",
                "Riverdale",
                "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                "2017",
                "Mystery, Drama, Crime",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/pHcNHYPg0c2vg7qay6wjJoApUgS.jpg"
            )
        )
        tvshow.add(
            TvshowEntity(
                "tv7",
                "Manifest",
                "After landing from a turbulent but routine flight, the crew and passengers of Montego Air Flight 828 discover five years have passed in what seemed like a few hours. As their new realities become clear, a deeper mystery unfolds and some of the returned passengers soon realize they may be meant for something greater than they ever thought possible.",
                "2018",
                "Drama, Mystery",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/1xeiUxShzNn8TNdMqy3Hvo9o2R.jpg"
            )
        )
        tvshow.add(
            TvshowEntity(
                "tv8",
                "Supergirl",
                "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism.",
                "2015",
                "Drama, Sci-Fi & Fantasy, Action & Adventure",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/zsaiq8ZclPuneuN7loLEbsh1ANJ.jpg"
            )
        )
        tvshow.add(
            TvshowEntity(
                "tv9",
                "Lucifer",
                "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.",
                "2016",
                "Crime, Sci-Fi & Fantasy",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/vkGnVBSNpayJ1oCfyVaMvhrim95.jpg"
            )
        )
        tvshow.add(
            TvshowEntity(
                "tv10",
                "The Promised Neverland",
                "Surrounded by a forest and a gated entrance, the Grace Field House is inhabited by orphans happily living together as one big family, looked after by their \"Mama,\" Isabella. Although they are required to take tests daily, the children are free to spend their time as they see fit, usually playing outside, as long as they do not venture too far from the orphanage — a rule they are expected to follow no matter what. However, all good times must come to an end, as every few months, a child is adopted and sent to live with their new family... never to be heard from again.",
                "2019",
                "Animation, Mystery, Sci-Fi & Fantasy, Action & Adventure, Drama",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/oBgRCpAbtMpk1v8wfdsIph7lPQE.jpg"
            )
        )
        return tvshow
    }

}