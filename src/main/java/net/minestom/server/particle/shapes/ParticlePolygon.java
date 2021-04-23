package net.minestom.server.particle.shapes;

import net.minestom.server.instance.Instance;
import net.minestom.server.utils.Position;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Iterator;

public class ParticlePolygon extends ParticleShape {
    private final Position[] points;

    public ParticlePolygon(@NotNull Position[] points) {
        this.points = points;
    }

    public PolygonIterator iterator(ShapeOptions options) {
        return new PolygonIterator(this, options);
    }

    public static class PolygonIterator extends ParticleIterator<ParticlePolygon> implements Iterator<ParticleLine.LineIterator> {
        private int index = 0;

        protected PolygonIterator(ParticlePolygon polygon, ShapeOptions options) {
            //TODO particleCount should become particleDistance (or at least optional)
            super(polygon, options);
        }

        @Override
        public boolean hasNext() {
            return index < shape.points.length;
        }

        @Override
        public ParticleLine.LineIterator next() {
            Position position1 = shape.points[index];
            index++;
            Position position2 = shape.points[hasNext() ? index : 0];

            return new ParticleLine(position1, position2).iterator(options);
        }

        @Override
        public void draw(@NotNull Instance instance, @NotNull Position start) {
            while (hasNext()) {
                ParticleLine.LineIterator line = next();
                line.draw(instance, start);
            }
        }
    }

    @Override
    public String toString() {
        return "ParticlePolygon{" +
                "points=" + Arrays.toString(points) +
                '}';
    }
}
