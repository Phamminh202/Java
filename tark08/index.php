<?php
$_SESSION['username']="Admin";
?>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>My Portfolio</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://fonts.googleapis.com/css?family=Catamaran:100,200,300,400,500,600,700,800,900|Cormorant+Garamond:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">
    <link rel="stylesheet" href="style.css">

</head>
<body>
<header>
    <a href="temp.html" class="header-brand">CODELEAN</a>
    <nav>
        <ul>
            <li><a href="portfolio.html">DKT</a></li>
            <li><a href="about.html">About me</a></li>
            <li><a href="contact.html">Contact</a></li>
        </ul>
        <a href="cases.html" class="header-cases">Cases</a>
    </nav>
</header>
<main>

    <section class="gallery-links">
        <div class="wrapper">
            <h2>Gallery</h2>

            <div class="gallery-container">
                <?php
                include_once 'includes/dbh.inc.php';

                $sql="SELECT * FROM gallery ORDER BY orderGallery DESC;";
                $stmt=mysqli_stmt_init($conn);
                if (!mysqli_stmt_prepare($stmt,$sql)){
                    echo "SQL statement failed!";
                }else{
                    mysqli_stmt_execute($stmt);
                    $result=mysqli_stmt_get_result($stmt);

                    while ($row=mysqli_fetch_assoc($result)){
                        echo '<a href="#">
                        <div style="background-image: url(img/gallery/'.$row["imgFullNameGallery"].');"></div>
                        <h3>'.$row["titleGallery"].'</h3>
                        <p>'.$row["descGallery"].'</p></a>';
                    }
                }
                ?>
            </div>

            <?php
            if (isset($_SESSION['username'])){
                echo '<div class="gallery-upload">
                    <h2>Upload</h2>
                    <form action="includes/gallery-upload.inc.php" method="post" enctype="multipart/form-data">
                        <input type="text" name="filename" placeholder="File name...">
                        <input type="text" name="filetitle" placeholder="Image title...">
                        <input type="text" name="filedesc" placeholder="Image description...">
                        <input type="file" name="file">
                        <button type="submit" name="submit">UPLOAD</button>
                    </form>
                    </div>';
            }
            ?>
        </div>
    </section>
    <div class="wrapper">
        <footer>
            <ul class="footer-links-main">
                <li><a href="#">Home</a></li>
                <li><a href="#">Cases</a></li>
                <li><a href="#">Portfolio</a></li>
                <li><a href="#">About me</a></li>
                <li><a href="#">Contact</a></li>
            </ul>
            <ul class="footer-links-main">
                <li><p>Later cases</p></li>
                <li><a href="#">CODELEAN - WEB DEVELOPMENT</a></li>
                <li><a href="#">THIDK - WEB DEVELOPMENT, SEO</a></li>
                <li><a href="#">KIMTHI - YOUTUBE CHANNEL</a></li>.
                <li><a href="#">CODELEAN - VIDEO PRODUCTION</a></li>
            </ul>
            <div class="footer-sm">
                <a href="#">
                    <img src="img/3c1321b1cf478d373840a2a9ac7a4ebc.jpg" alt="youtube icon" style="height: 40px;width: 40px;">
                </a>
                <a href="#">
                    <img src="img/5-centimeters-second-view-desktop-background.jpg" alt="youtube icon" style="height: 40px;width: 40px;">
                </a>
                <a href="#">
                    <img src="img/anime-laptop-23.jpg" alt="youtube icon" style="height: 40px;width: 40px;">
                </a>
            </div>
        </footer>
    </div>
</body>
</html>
