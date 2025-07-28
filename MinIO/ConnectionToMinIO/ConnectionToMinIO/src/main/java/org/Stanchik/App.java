package org.Stanchik;

import io.minio.GetObjectArgs;
import io.minio.MakeBucketArgs;
import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import io.minio.errors.MinioException;
import io.minio.messages.Bucket;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        MinioClient minioClient =
                MinioClient.builder()
                        .endpoint("http://127.0.0.1:9000")
                        .credentials("Maxim", "1337R1337R")
                        .build();
        try {
            List<Bucket> allBuckets = minioClient.listBuckets();
            System.out.println("Number of buckets: " + allBuckets.size());
            System.out.println("All buckets:");
            allBuckets.forEach(n ->System.out.println(n.name()));

            minioClient.makeBucket(
                    MakeBucketArgs.builder().bucket("user6")
                            .build()
            );

            InputStream inputStream = new FileInputStream("D:/User/Desktop/images/burgers.png");

            minioClient.putObject(PutObjectArgs
                    .builder()
                    .bucket("user1")
                    .object("burgers.png")
                    .stream(inputStream, inputStream.available(), -1)
                    .contentType("image/png")
                    .build());

            inputStream.close();

            try (InputStream stream =
                         minioClient.getObject(GetObjectArgs
                                 .builder()
                                 .bucket("user1")
                                 .object("burgers.png")
                                 .build())) {
                BufferedImage image = ImageIO.read(stream);
                File outputfile = new File("D:/User/Desktop/images/burgers_saved.png");
                ImageIO.write(image, "png", outputfile);
            }
        }
        catch (MinioException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        catch (InvalidKeyException e) {
            e.printStackTrace();
        }
    }
}
